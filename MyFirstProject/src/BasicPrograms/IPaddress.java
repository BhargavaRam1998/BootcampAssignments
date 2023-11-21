package BasicPrograms;

public class IPaddress {

    public static String defangIPaddr(String address){
        if (address.contains("."))
        {
            String defang_address = address.replace(".","[.]");

            return defang_address;
        }

        return address;
    }
    public static void main(String[] args) {

        String final_address = IPaddress.defangIPaddr("1.1.1.1");

        System.out.println(final_address);
    }
}
