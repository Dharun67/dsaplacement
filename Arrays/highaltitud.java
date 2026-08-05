class Solution {
    public int largestAltitude(int[] gain) {

        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }

        return maxAltitude;
    }


        public static void main(String[] args) {
        highaltitud obj = new highaltitud(new int[]{1,2,3,4});
        int[] result = obj.sumRange(1,3);
        System.out.println("Result: " + Arrays.toString(result));
    }

}                   