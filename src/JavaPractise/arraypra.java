package JavaPractise;
//sum and average of elements
public class arraypra {
public static void main(String[] args) {
	
	int a[]= {20,40,60,80,100};
	int sum=0;
	double average;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
System.out.println(sum);
System.out.println("length of array is:"+a.length);
//average
average=sum/a.length;
System.out.println("average is:"+average);

}
}
