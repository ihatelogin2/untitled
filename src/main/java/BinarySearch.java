public class BinarySearch {
    int index;


    public BinarySearch(int index) {
        this.index = index;
    }

    public int binarySearch(int tab[], int index){
        int min = tab[0];
        int max = tab[tab.length -1];
        int mid = 0;
        while(min <= max){
            mid = min + max /2;
            if(tab[mid] == index){
                return mid;
            }else if (tab[mid] < index){
                min = mid +1;
            }else{
                max = mid -1;
            }
        }
        return -1;
    }

    public void binarySearch() {
    }
}
