public class SwitchStatement {
    
    private int getSortOrder(String firstName, final String lastName) {

        String middleName = "Patricia";
        final String suffix = "JR";  
        int id = 0;

        // data types supported by switch : int-Integer , byte-Byte , short-Short , char-Character , String ,  enum values
        // boolean and long, and their associated wrapper classes, are not supported by switch statements
        
        // cases can be literals, enum constants or final constants!

        switch(firstName) {
            case "Test":
                return 52;
            // case middleName:  // DOES NOT COMPILE      
            //     id = 5;     
            //     break;    
            case suffix:      
                id = 0;      
                break;    
            // case lastName:  // DOES NOT COMPILE      
            //     id = 8;      
            //     break;    
            // case 5:  // DOES NOT COMPILE      
            //     id = 7;      
            //     break;    
            // case 'J':  // DOES NOT COMPILE      
            //     id = 10;      break;    
            // case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE      
            //     id=15;      
            //     break;  
        }  
        return id; 
    }
}
