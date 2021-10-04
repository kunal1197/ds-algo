public class digit9
{
public void main(int n)
{
int x=n;int c=0;int i;int s=0;
while(n!=0)
{
int a=n%10;
for(i=1;i<=a;i++)
{
if(a%i==0)
c=c+1;
}
if(c==2)
s=s+a;
n=n/10;
}
System.out.println(s);
}
}
