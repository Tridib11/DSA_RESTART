//package Arrays_and_ArrayList;
//
//public class Find_in_Mountain_Array {
//  public static void main(String[] args) {
//
//  }
//
//
//  public int findInMountainArray(int target, MountainArray mountainArr) {
//    int peakIndexInTheDamArray = peakIndex(mountainArr);
//    int firstTry = aescendingBS(mountainArr, target, 0, peakIndexInTheDamArray);
//    int secondTry = descendingBS(mountainArr, target, peakIndexInTheDamArray + 1, mountainArr.length - 1);
//    if (firstTry != -1) {
//      return firstTry;
//    } else if (secondTry != -1) {
//      return secondTry;
//    } else {
//      return -1;
//    }
//
//  }
//
//  public static int peakIndex(int[] mountainArr) {
//    int start = 0;
//    int end = mountainArr.length;
//    while (start < end) {
//      int mid = start + (end - start) / 2;
//      if (mountainArr[mid] > mountainArr[mid + 1]) {
//        end = mid;
//      } else {
//        start = mid + 1;
//      }
//    }
//    return start;
//  }
//
//  public static int aescendingBS(int[] mountainArr, int target, int start, int end) {
//    while (start <= end) {
//      int mid = start + (end - start) / 2;
//      if (mountainArr[mid] == target) {
//        return mid;
//      } else if (target < mountainArr[mid]) {
//        end = mid - 1;
//      } else {
//        start = mid + 1;
//      }
//    }
//    return -1;
//  }
//
//  public static int descendingBS(int[] mountainArr, int target, int start, int end) {
//    while (start <= end) {
//      int mid = start + (end - start) / 2;
//      if (mountainArr[mid] == target) {
//        return mid;
//      } else if (target < mountainArr[mid]) {
//        start = mid + 1;
//      } else {
//        end = mid - 1;
//      }
//    }
//    return -1;
//  }
//}
