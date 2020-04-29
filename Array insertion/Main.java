#include<iostream>
using namespace std;
int main()
{
int n,loc,num;
again:cout<<"Enter the number of elements in the array";
  cin>>n;
  if(n>20)
    goto again;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  //location
  cout<<"\nEnter the location where you wish to insert an element";
  cin>>loc;
  if(loc<=n)
  {
  //number
  cout<<"\nEnter the value to insert";
  cin>>num;
  //output code
  int out[n+1];
  for(int i=0;i<loc-1;i++)
  {
    
    out[i]=a[i];
  }
  out[loc-1]=num;
  for(int i=loc,j=loc-1;i<n+1;i++,j++)
  {
    out[i]=a[j];
  }
  cout<<"\nArray after insertion is\n";
   for(int i=0;i<=n;i++)
  {
    
    cout<<out[i]<<"\n";
  }
  }
  else
    cout<<"\nInvalid Input";
}