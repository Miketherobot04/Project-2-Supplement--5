public static int countUniqueSubarrays(int[] arr, int target) {
    if (arr == null || arr.length == 0) return 0;

    HashSet<String> uniqueSubarrays = new HashSet<>();
    for (int start = 0; start < arr.length; start++) {
        int sum = 0;
        StringBuilder subarray = new StringBuilder();
        for (int end = start; end < arr.length; end++) {
            sum += arr[end];
            subarray.append(arr[end]).append(",");
            if (sum == target) uniqueSubarrays.add(subarray.toString());
        }
    }
    return uniqueSubarrays.size();