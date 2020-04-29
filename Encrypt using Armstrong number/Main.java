#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp=n,b,sum=0;
   while(temp>0)
   {
     int a;
     a=temp%10;
     b++;
     temp=temp/10;
    }
  int raiseto=b;
  int temp2=n;
  while(temp2>0)
  {
    int a=temp2%10;
    temp2=temp2/10;
    sum=sum+power(a,raiseto);
    
  }
  if(sum==n)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}