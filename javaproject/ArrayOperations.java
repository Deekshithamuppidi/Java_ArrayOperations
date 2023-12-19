package ArrayMethods;

import java.util.Arrays;

public class ArrayOperations {
	
	public void display(int a[]) {
		System.out.print("[ ");
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println(" ]");
		
	}
	//insert
	public int[] insert(int a[],int pos,int ele) {
	if(pos<1 || pos>a.length+1) {
		System.out.println("Insertion is Not Possible");
		return a;
	}
	else {
		int res[]=new int [a.length+1];
		for(int i=0,j=0;i<res.length;i++) {
		if(pos-1==i) {
			res[i]=ele;
		}else {
			res[i]=a[j++];
		}
		}
		return res;
	}
		
	}
	//fo
	public int fo(int a[],int ele) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	//delete
	public int[] delete(int a[],int ele) {

		int ind=fo(a,ele);	
		if(a.length==0) {
			System.out.println("Array is Empty");
			return a;
		}
		else if(ind==-1) {
			System.out.println("Deleting ele is not present in array");
			return a;
		}
		else {
			int res[]= new int[a.length-1];
		for(int i=0,j=0;i<a.length;i++) {

				 if(ind!=i) {
					 res[j++]=a[i];		
				 }
		}
		return res;
		}
		
	}
	
	
	//update
	public void update(int old_ele,int a[],int new_ele) {
		
		int ind=fo(a,old_ele);
		if(a.length==0){
			System.out.println("Array is Empty");
		}
		else if(ind==-1) {
			System.out.println("replacing ele is not present in array");
		}
		
		else{
			for(int i=0;i<a.length;i++) {
				if(i==ind){
					a[i]=new_ele;
					break;
				}
			}
			
		}
	}
	
		public void updateAll(int old_ele,int a[],int new_ele) {
		
		int ind=fo(a,old_ele);
		if(a.length==0){
			System.out.println("Array is Empty");
		}
		else if(ind==-1) {
			System.out.println("replacing ele is not present in array");
		}
		
		else{
			for(int i=0;i<a.length;i++) {
				if(a[i]==old_ele){
					a[i]=new_ele;
					
				}
			}
		
		}
	}
	//merge
	public int[] insertAll(int a[],int b[]) {
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++) {
			res[k++]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			res[k++]=b[i];
		}
		return res;
		
	}
	//sort
	public void sortAce(int a[]) {
		for(int i=0;i<a.length-1;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
					
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		for(int i:a) {
			System.out.print(i + " ");
		}
		
	}
	//sortdes
		public void sortDes(int a[]) {
			for(int i=0;i<a.length-1;i++) {
				int min=i;
				for(int j=i+1;j<a.length;j++) {
					if(a[min]<a[j]) {
						min=j;
						
					}
				}
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
			for(int i:a) {
				System.out.print(i + " ");
			}
			
		}
	//min
	
	public int min(int a[]) {	
		int min=a[0];
		for(int i=0;i<a.length;i++) {

			for(int j=i+1;j<a.length;j++) {
				if(a[j]<min) {
					min =a[j];
				}
			}
		}
		return min;
		
	}
	//max

		public int max(int a[]){
	
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[j]>max) {
					max=a[j];
				}
			}
		}
		return max;
		
	}
	//first Occurance
		
	public int firstOccurance(int a[], int ele) {
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
					
		}
		return -1;
	}
	
	//last Occurance
	
	public int lastOccurance(int a[],int ele) {
		int ind=-1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) 
			ind=i;
			
		}
		return ind;
	}
	
	//reverse
	
	public int[] reverse(int a[]) {
		int rev[]= new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			rev[j]=a[i];
		}
		
		return rev;
	}
	
	//size
	public int size(int a[]) {
		return a.length;
	}
	
	public int[] clear() {
		return new int[0];
	}
	
	//deleteAll
		public int[] deleteAll(int a[],int ele) {

			int ind=fo(a,ele);	
			if(isEmpty(a)) {
				System.out.println("Array is Empty");
				//return a;
			}
			else if(ind==-1) {
				System.out.println("Deleting ele is not present in array");
				//return a;
			}
			else {
				int res[]= new int[a.length-occurance(a,ele)];
			for(int i=0,j=0;i<a.length;i++) {

					 if(ele!=a[i]) {
						 res[j++]=a[i];		
					 }
			}
			return res;
			}
			return a;
		}
		//count - occurance
		
		public int occurance(int a[],int ele) {
			int c=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]==ele) {
					c++;
				}
			}
			return c;
		}
		
		//isEmpty
		public boolean isEmpty(int a[]) {
			return a.length==0;
		}
		
		//sum
		public int sum(int a[]) {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				sum+=a[i];
			}
			return sum;
		}
		
		public int product(int a[]) {
			int p=1;
			for(int i=0;i<a.length;i++) {
				p*=a[i];
			}
			return p;
		}
		public int avg(int a[]) {
			return sum(a)/size(a);
		}
}
