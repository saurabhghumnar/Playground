#include<iostream>
using namespace std;
int fact=1;
int factorial(int a)
{
  if(a==0)
  {
    return 1;
  }
  fact=a*factorial(a-1);
  return fact;
}
int main()
{
int n,output;
  cin>>n;
  output=factorial(n);
  cout<<"The factorial of "<<n<<" is "<<output;
}