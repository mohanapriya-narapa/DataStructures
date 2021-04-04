package interview;
import java.io.*;
import java.util.*;
public class intersect {

	public static void main(String[] args) {
		int[] arr1=new int[] {2,4,6,9};
		int[] arr2=new int[] {1,3,5,6};
int[] arrr= intersection(arr1,arr2);
System.out.println(Arrays.toString(arrr));
	}

	    public static int[] intersection(int[] nums1, int[] nums2) {
	        Set<Integer> set = new HashSet<>();
	        Set<Integer> intersect = new HashSet<>();
	        for (int i = 0; i < nums1.length; i++) {
	            set.add(nums1[i]);
	        }
	        for (int i = 0; i < nums2.length; i++) {
	            if (set.contains(nums2[i])) {
	                intersect.add(nums2[i]);
	            }
	        }
	        int[] result = new int[intersect.size()];
	        int i = 0;
	        for (Integer num : intersect) {
	            result[i++] = num;
	        }
	        return result;
	    }
	}

