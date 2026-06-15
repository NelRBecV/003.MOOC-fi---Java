package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean dictionaryLoaded = dictionary.load();
        if(dictionaryLoaded){
            System.out.println("Java dictionary was successfully loaded");
        }
        dictionary.add("programation", "programming");
        dictionary.add("papilion", "mariposa");
        dictionary.add("chien", "perro");
        dictionary.add("voiture", "vehiculo");
        
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("chien"));
        System.out.println(dictionary.translate("beer"));
        System.out.println(dictionary.translate("below"));
        
        dictionary.delete("mariposa");
        
        
        System.out.println(dictionary.translate("fleur"));
        System.out.println(dictionary.translate("chien"));
        System.out.println(dictionary.translate("bateau"));
       
        
        dictionary.save();        
    }
}
