package ACP8.homeworkProf2.Cafe;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Razer on 04.09.15.
 */
public enum PriceList {
    PRICES;

    Map<String, Double> hashMap = new HashMap<>();

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
        String price = builder.toString();
        String[] kvPairs = price.split(";");
        for (String kvPair : kvPairs) {
            String[] kv = kvPair.split("=");
            String key = kv[0];
            Double value = Double.parseDouble(kv[1]);
            hashMap.put(key, value);
        }
    }

    public double getPrice(String keyToSearch) {
        return searchPriceFromConfigFile(keyToSearch.toLowerCase());
    }

    private double searchPriceFromConfigFile(String Key) {
        Double result = null;
        if (hashMap.containsKey(Key)) {
            result = hashMap.get(Key);
        }
        return result;
    }

}

