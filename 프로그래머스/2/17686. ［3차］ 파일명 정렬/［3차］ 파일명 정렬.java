import java.util.*;

class File {
    private String head;
    private String number;
    private String tail;
    private String full;
    
    public File(String head, String number, String tail) {
        this.head = head;
        this.number = number;
        this.tail = tail;
        this.full =  head + number + tail;
    }
    
    String getHead() {
        return head;
    }
    
    String getNumber() {
        return number;
    }
    
    String getFull() {
        return full;
    }
}

class Solution {
    public String[] solution(String[] files) {
        int filesLen = files.length;
        
        File[] file = new File[filesLen];
        String[] answer = new String[filesLen];
        
        for (int i = 0; i < filesLen; i++) {
            int index = 0;
            String str = files[i];
            
            String head = "", number = "";
            while (str.charAt(index) > '9' || str.charAt(index) < '0') {
                head += Character.toString(str.charAt(index));
                index += 1;
            }
            
            while (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
                number += Character.toString(str.charAt(index));
                index += 1;
                if (index >= str.length()) break;
            }
            
            String tail = str.substring(index);
            
            file[i] = new File(head, number, tail);
        }
        
        
        Arrays.sort(file, new Comparator<File>() {
            @Override
            public int compare(File a, File b) {
                String aHead = a.getHead(), bHead = b.getHead();
                int aNumber = Integer.parseInt(a.getNumber());
                int bNumber = Integer.parseInt(b.getNumber());
                if (aHead.toUpperCase().equals(bHead.toUpperCase())) {
                    if (aNumber > bNumber) {
                        return 1;
                    } else if (aNumber < bNumber) {
                        return -1;
                    }
                    return 0;
                }
                else if (a.getHead().toUpperCase().compareTo(b.getHead().toUpperCase()) < 0) {
                    return -1;
                }
                return 1;
            }
        });
        
        for (int i = 0; i < filesLen; i++) {
            answer[i] = file[i].getFull();
        }
        
        return answer;
    }
}