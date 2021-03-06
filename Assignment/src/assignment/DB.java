package assignment;

import MyLogger.MyLogger;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.DatatypeConverter;

public class DB {

    private static final String DBFILENAME = "stock.csv";
    private static final Path dbPath = Paths.get(DBFILENAME);

    private static final String SECRETFILENAME = "secret.txt";
    private static final Path secretPath = Paths.get(SECRETFILENAME);

    public static String[] returnAll() {
        List<String> data = null;
        try {
            data = Files.readAllLines(dbPath);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // populate the data from list into String[]
        String[] container = new String[data.size()];
        container = data.toArray(container);
        return container;
    }

    /**
     * This is for testing purpose only, not use in production
     * 
     * @return Header is return in Object[]
     */
    public static Object[] returnSplitedHeader() {
        String[] data = returnAll();
        List<String> head = null;
        for (int i = 0; i < 1; i++) {
            String[] header = data[i].split("\\,");
            head = Arrays.asList(header);
        }
        return head.toArray();
    }

    public static ArrayList<String> returnAllPicUrl() {
        ArrayList<String> picUrl = new ArrayList<>();
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 5; j < split.length; j++) {
                // Add to an array
                picUrl.add(split[j]);
            }
        }
        return picUrl;
    }

    public static ArrayList<String> returnAllStockName() {
        ArrayList<String> stockName = new ArrayList<>();
        for (int i = 1; i < DB.returnAll().length; i++) {
            String id = String.valueOf(i);
            String e = getStockNameByID(id);
            stockName.add(e);
        }
        return stockName;
    }

    public static ArrayList<String> returnAllStockPrice() {
        ArrayList<String> stockPrice = new ArrayList<>();
        for (int i = 1; i < DB.returnAll().length; i++) {
            String id = String.valueOf(i);
            String e = getStockPriceByID(id);
            if (!(e.contains("."))) {
                e += ".00";
            }
            stockPrice.add(e);
        }
        return stockPrice;
    }

    public static ArrayList<String> returnAllStock() {
        ArrayList<String> stock = new ArrayList<>();
        for (int i = 1; i < DB.returnAll().length; i++) {
            String id = String.valueOf(i);
            String e = getStockByID(id);
            stock.add(e);
        }
        return stock;
    }

    /**
     * This is for testing purpose only, not use in production
     */
    public static void echoAll() {
        System.out.println(Arrays.toString(returnAll()) + "\n");
    }

    /**
     * This is for testing purpose only, not use in production
     */
    public static void echoSplited() {
        String[] data = returnAll();
        Object[] header = returnSplitedHeader();
        int x = 0;
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < split.length; j++) {
                System.out.print(header[x] + " : " + split[j] + "\n");
                if (x < header.length - 1) {
                    // Add counter
                    x++;
                } else {
                    // Reset counter
                    System.out.println("--------------------------");
                    x = 0;
                }
            }
        }
    }

    /**
     * This is for testing purpose only, not use in production
     */
    public static void addLine() {
        // TODO :
        // No Negative number for price, stock
        // NO word beside T/F for Avail
        Scanner read = new Scanner(System.in);
        Object[] header = returnSplitedHeader();
        String addLine = returnAll().length + ",";
        for (int i = 1; i < header.length - 1; i++) {
            System.out.println("Please enter value of " + header[i]);
            String line = read.nextLine();
            addLine += line + ",";
        }
        System.out.println("Please enter value of Picture Number");
        String line = read.nextLine();
        addLine += "src/assignment/asset/pic/temp/" + line + ".jpg";

        try {
            System.out.println("adding to database");
            Files.write(dbPath, addLine.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    

    public static String getStockNameByID(String id) {
        String stockName = null;
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < 1; j++) {
                if (id.equals(split[j])) {
                    stockName = split[j + 1];
                }
            }
        }
        return stockName;
    }

    /**
     *
     * @param id Stock ID (String)
     * @return
     */
    public static String getStockPriceByID(String id) {
        String price = null;
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < 1; j++) {
                if (id.equals(split[j])) {
                    price = split[j + 2];
                }
            }
        }
        return price;
    }

    /**
     *
     * @param id Stock ID (String)
     * @return
     */
    public static String getStockByID(String id) {
        String stock = null;
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < 1; j++) {
                if (id.equals(split[j])) {
                    stock = split[j + 3];
                }
            }
        }
        return stock;
    }

    /**
     *
     * @param id Stock ID (String)
     * @return
     */
    public static String getStockAvailabilityByID(String id) {
        String availability = null;
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < 1; j++) {
                if (id.equals(split[j])) {
                    availability = split[j + 4];
                }
            }
        }
        return availability;
    }

    /**
     *
     * @param id Stock ID (String)
     * @return
     */
    public static String getStockImageByID(String id) {
        String img = null;
        String[] data = returnAll();
        for (int i = 1; i < data.length; i++) {
            // Spilit the data by ,
            String[] split = data[i].split("\\,");
            for (int j = 0; j < 1; j++) {
                if (id.equals(split[j])) {
                    img = split[j + 5];
                }
            }
        }
        return img;
    }

    /**
     *
     * @param id Stock ID (String)
     */
    public static void reduceStock(String id) {
        String[] data = returnAll();
        int idd = Integer.valueOf(id);
        String line = data[idd];
        String[] splited = line.split("\\,");
        String stock = splited[3];
        int newStock = (Integer.valueOf(stock) - 1);

        data[idd] = splited[0] + "," + splited[1] + "," + splited[2] + "," + String.valueOf(newStock) + "," + splited[4]
                + "," + splited[5];

        String info = "";
        for (int i = 0; i < data.length; i++) {
            info += data[i] + "\n";
        }

        deleteAndWriteAgain(info);

    }

    /**
     *
     * @param data data that you want to write to the DB text, make sure the data is
     *             well formatted
     * @return Status that of write the file, 0 is success and 1 is failed
     */
    public static int deleteAndWriteAgain(String data) {
        int status = 0;
        try {
            Files.write(dbPath, data.getBytes(), StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.CREATE);
        } catch (IOException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            status = 1;
        }

        return status;
    }

    /**
     *
     * @param inputBytes the original password that you want to fin the hashed value
     * @param algorithm  the algorithm that you want to find (Default is SHA-256) in
     *                   this assignment class
     * @return
     */
    public static String getHash(byte[] inputBytes, String algorithm) {
        String hashValue = "";
        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);
            md.update(inputBytes);
            byte[] digestedByte = md.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedByte).toLowerCase();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return hashValue;
    }

    /**
     *
     * @param password the password to opening the admin panel
     * @return
     */
    public static int updatePassword(String password) {
        String algorithm = "SHA-256";
        String hashValue = getHash(password.getBytes(), algorithm);

        int status = 0;
        try {
            Files.write(secretPath, hashValue.getBytes(), StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.CREATE);
            MyLogger ml = new MyLogger();
            ml.setHead("WARNING");
            ml.addHeadIndent(1);
            ml.setBody("Password was changed");
            ml.log();
        } catch (IOException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            status = 1;
        }

        return status;

    }

    public static String returnPassword() {
        List<String> data = null;
        try {
            data = Files.readAllLines(secretPath);
        } catch (IOException e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
        // populate the data from list into String[]

        return data.get(0);

    }
    // DB Stucter
    // ID , Name , Price , Stock , Image , Available V
    // TODO
    // 1.Read the file V
    // 1.1 Read all record V
    // 1.2 Read by line V
    // 1.3 Read without headling (table) V
    // 1.4 Read with vertain ID given V
    // 2. Data Validation
    // 2.1 Not Negative number for price, Stock
    // 2.2 All fill are required
    // 3. Write / Modify the file
    // 3.1 Write New Line
    // 3.1.1 Upload Picture ...
    // 3.2 Change certain value with ID given
}
