#include<iostream>
using namespace std;
int main()
{
  int rail;
  string door;
  cin>>door>>rail;
 
  if(door=="front")
  {
    if(rail==1)
      cout<<"Left Handed";
    else cout<<"Right Handed";
  }
  if(door=="rear")
  {
    if(rail==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
  }