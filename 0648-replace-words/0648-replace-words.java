class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String name[] = sentence.split(" ");
        String arr [] = new String[dictionary.size()]; 
        arr = dictionary.toArray(arr);
       for(int i=0;i<name.length;i++){
           for(int j=0;j<arr.length;j++){
            if(name[i].startsWith(arr[j])){
              name[i] = arr[j];
            }
           }
       }
      return String.join(" ", name);
     
    }
}