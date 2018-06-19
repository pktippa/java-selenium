class ControlStatements {
    public static void main(String args[]) {
        int x = 10;
        int y = 10;

        // if -> (Expression) -> Boolean
        if(x > y) {
            System.out.println("X Gt Y");
        } else if(x < y){
            System.out.println("X Lt Y");
        } else {
            System.out.println("X Eq Y");
        }

        String name = "Pradeep";
        switch(name) {
            case "Pradeep": System.out.println("This is Pradeep");
        }
        //
    }
}