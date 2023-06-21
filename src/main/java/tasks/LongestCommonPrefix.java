package tasks;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Map<String, Integer> hmPrefixUseCount = new HashMap<>();
        String longestPrefix = "";
        for (int i = 0; i < strs.length; i++){
            String str = strs[i];
            String prefix = "";
            for (int j = 0; j < str.length(); j++){
                prefix = prefix.concat(String.valueOf(str.charAt(j)));
                int count = 1;
                if (hmPrefixUseCount.containsKey(prefix)){
                    count = hmPrefixUseCount.get(prefix) + 1;
                }
                if (count == strs.length){
                    if (prefix.length() > longestPrefix.length()){
                        longestPrefix = prefix;
                    }
                }
                hmPrefixUseCount.put(prefix, count);
            }
        }return longestPrefix;
    }
}
