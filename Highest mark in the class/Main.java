#include<iostream>
using namespace std;
int main()
{
int n,sum=0;
  cin>>n;
  int marks[n];
  for(int i=0;i<n;i++)
  {
    cin>>marks[i];
  }
  for(int i=0;i<n;i++)
  {
    if(sum<marks[i])
       sum=marks[i];
  }
  cout<<sum;
}