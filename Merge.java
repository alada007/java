package sort;

public class Merge {
	void sort(int []nums,int from,int to)
	{
		int [] result = new int[to-from+1];
		
		int middle = (from+to)/2;
		
		if(from < to)
		{
			sort(nums,from,middle);
			sort(nums,middle+1,to);
			int i = from, j = middle + 1;  
			int m = middle,   n = to;  
			int k = 0;  
			while (i <= m && j <= n)  
			{  
			   if (nums[i] <= nums[j])
			   {
			      result[k++] = nums[i++];  
			   }
			   else  
			   {
			      result[k++] = nums[j++];  
			   }
			}  
			
			while (i <= m)  
			{
			      result[k++] = nums[i++];  
			}
			while (j <= n)  
			{
			      result[k++] = nums[j++];  
			}
			for (i = 0; i < k; i++)  
			      nums[from + i] = result[i];  
			result = null;
			      
		}
		
	}
	public Merge() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= new int[]{1,4,7,8,2,6,2,45,4,3,1,3,5,6,7};
		Merge merge = new Merge();
		merge.sort(nums, 0, nums.length-1);
		for(int i : nums)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
