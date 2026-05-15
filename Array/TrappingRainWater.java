package Array;

public class TrappingRainWater {
    public static int trappedWater(int height[]){
        int n = height.length;

        //left boundry
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }

        //rigth boundry
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }

        //trpped Water
        int trppedWater = 0;
        for(int i=0;i<n;i++){
            int Waterlevel = Math.min(leftmax[i], rightmax[i]);
            trppedWater += Waterlevel - height[i];
        }
        return trppedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = trappedWater(height);
        System.out.println("Trapped Water : "+result);
    }
}
