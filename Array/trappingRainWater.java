public class trappingRainWater {
    public static void TrapWater(int height[]){
        int n = height.length;
        //left max boundary
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for(int i=1;i<maxLeft.length;i++){
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }

        //right max boundary
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        //Trap Water
        int TrapWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            TrapWater += (waterLevel - height[i]);
        }

        System.out.println("Total TrapWater : "+TrapWater);

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        TrapWater(height);
    }
}
