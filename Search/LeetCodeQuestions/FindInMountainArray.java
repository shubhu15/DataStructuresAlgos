package Search.LeetCodeQuestions;


 interface MountainArray {
      int get(int index);
      int length();
 }


public class FindInMountainArray {


//    https://leetcode.com/problems/find-in-mountain-array/
    public int findInMountainArray(int target, MountainArray mountainArr) {

        // first finding the peak in mountain array
        int peak = getPeak(mountainArr);

        // searching the target in the start to peak arr - which is in increasing order
        int fm = getBinarySearch(mountainArr, target, 0, peak, true);

        // searching the target in the peak+1 to end arr - which is in decreasing order
        int lm = getBinarySearch(mountainArr, target, peak+1, mountainArr.length()-1, false);

        if(fm!=-1)
            return fm;
        else
            return lm;

    }


    int getBinarySearch(MountainArray mountainArr, int target, int start, int end, boolean isStart){

        int ans =-1;
        while(start<=end){

            int mid = start + (end-start)/2;

            if(isStart)
            {
                if(mountainArr.get(mid)==target)
                {return mid;}
                else if(target>mountainArr.get(mid))
                    start = mid+1;
                else
                    end = mid-1;

            }
            else {

                if(mountainArr.get(mid)==target)
                {return mid;}

                else if(target<mountainArr.get(mid))
                    start = mid+1;
                else
                    end = mid-1;
            }


        }
        return ans;

    }

    int getPeak(MountainArray mountainArr){

        int start =0;
        int end = mountainArr.length()-1;

        while(start<end){

            int mid = start + (end-start)/2;

            if(mountainArr.get(mid)> mountainArr.get(mid+1))
                end =mid;
            else
                start = mid+1;
        }


        return start;

    }
}
