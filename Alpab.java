package janani;

public class Alpab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,c;
String a;
c=args.length;
for(i=0;i<c;i++){
	for(j=i+1;j<c;j++){
		if(args[i].compareTo(args[j])>0){
			a=args[i];
			args[i]=args[j];
			args[j]=a;
		}
	}
}
int b=c;
for(i=0;i<c;i++){
	System.out.print(args[i]);
	b--;
	if(b!=0){
		System.out.print(",");
	}
}
	}

}
