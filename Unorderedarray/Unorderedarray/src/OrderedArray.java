// OrderedArray.java
public class OrderedArray {
    private Integer[] arr;
    private int count;

    public OrderedArray(int size) {
        arr = new Integer[size];
        count = 0;
    }

    public void insert(int x) {
        if (count == arr.length) resize(arr.length * 2);
        int i;
        for (i = count - 1; i >= 0 && arr[i] > x; i--) {
            arr[i + 1] = arr[i];
        }
        arr[i + 1] = x;
        count++;
    }

    public boolean delete(int x) {
        int index = find(x);
        if (index == -1) return false;
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[count - 1] = null;
        count--;
        return true;
    }

    public int find(int x) {
        int left = 0, right = count - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public int size() {
        return count;
    }

    public void resize(int newSize) {
        Integer[] newArr = new Integer[newSize];
        System.arraycopy(arr, 0, newArr, 0, Math.min(count, newSize));
        arr = newArr;
        if (count > newSize) count = newSize;
    }
}
