class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
          List<String> result = new ArrayList<>();
        // kuroo
        for(int h = 0; h < 12; h++) {
            for(int m = 0; m < 60; m++) {
                
                if(Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    
                    String minute = (m < 10) ? "0" + m : "" + m;
                    result.add(h + ":" + minute);
                }
            }
        }
        
        return result;
    }
}
