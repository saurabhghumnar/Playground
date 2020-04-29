#include<iostream>
using namespace std;
int main()
{
int n;
    int even=0,odd=0;
  again: cin>>n;
  if(n>15)
    goto again;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      even=even+a[i];
    else
      odd=odd+a[i];

  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;

  
}