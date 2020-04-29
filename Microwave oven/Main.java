#include<iostream>
using namespace std;
int main()
{
int n;
  float time;
  cin>>n>>time;
  if(n==1)
    cout<<time;
  else if(n==2)
    cout<<(1.5f*time);
  else if(n==3)
    cout<<(2.0f*time);
  else
    cout<<"Number of items is more";
    
}