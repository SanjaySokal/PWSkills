package JavaPractice.Encapsulation;

class encap {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        encap encap = new encap();

        encap.setName("Sanjay Sokal");
        System.out.println(encap.getName());
    }
}
