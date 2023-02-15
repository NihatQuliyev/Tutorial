package keyValue5;

public class Key_Value <K,V>{

    K key;
    V value;

    public Key_Value(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void get(){
        System.out.println("key: " + key);
        System.out.println("value: " + value);
    }
}
