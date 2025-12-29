class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int size=0;
        s=s.trim();
        for(int i=s.length()-1;i>=0;i--){
            String a = Character.toString(s.charAt(i));
            if(a.equals(" ")){
                return size;
            }
            size++;
        }
        return size;
    }
}
