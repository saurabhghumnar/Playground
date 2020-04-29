#include<iostream>
using namespace std;
int power(int ,int );
int val;
int main()
{
  
int a,n,ans;
  cout<<"Enter the value of a";
  cin>>a;
  cout<<"\nEnter the value of n";
  cin>>n;
  ans=power(a,n);
  cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<ans;
  }
int power(int a,int n)
{
  if(n==0)
  {
  return 1;  
  }
  else
  {
     val= a*power(a,n-1);
	return val;
  }
  
}