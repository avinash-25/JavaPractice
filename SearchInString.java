class SearchInString {
    public static void main(String[] args) {
        String name = "Avinash";
        char target = 'p';

        if(search(name,target))
            System.out.println("true");
        else
            System.out.println("False");
    }
    static boolean search(String str,char target){
        if(str.length() == 0)
             return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == target)
                return true;
        }
        return false;
    }

}
