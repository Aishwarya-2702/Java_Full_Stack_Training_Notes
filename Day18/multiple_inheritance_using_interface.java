package Day18;

interface parent1{
    void car();
}

interface parent2{
    void bike();
}

public class multiple_inheritance_using_interface implements parent1, parent2 {
    public void car(){
        System.out.println("Honda City");
    }
    public void bike(){
        System.out.println("Pulsar");
    }
    public static void main(String[] args) {
        multiple_inheritance_using_interface mi = new multiple_inheritance_using_interface();
        mi.car();
        mi.bike();
    }
}
