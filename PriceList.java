package ACP8.homeworkProf2.Cafe;

import java.io.*;


/**
 * Created by Razer on 04.09.15.
 */
public enum PriceList {
    PRICES;

    private String price;

    private PriceList() {
        setup();
    }

    public void setup() {
        String pathOfFile = getClass().getClassLoader().getResource("prices").getFile();
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                builder.append(currentLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        price = builder.toString();
    }

    private double searchPriceFromConfigFile(String specialKey) {
        Double result = null;
        String[] kvPairs = price.split(";");
        for (String kvPair : kvPairs) {
            String[] kv = kvPair.split("=");
            String key = kv[0];
            String value = kv[1];
            if (key.equals(specialKey)) {
                result = Double.parseDouble(value);
                break;
            }
        }
        return result;
    }

    public double getCoffeePrice() {
        return searchPriceFromConfigFile("coffee");
    }

    public double getTeaPrice() {
        return searchPriceFromConfigFile("tea");
    }

    public double getMilkPrice() {
        return searchPriceFromConfigFile("milk");
    }

    public double getSugarPrice() {
        return searchPriceFromConfigFile("sugar");
    }
}
