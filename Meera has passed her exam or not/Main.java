#include<iostream>
using namespace std;
int main()
{
  int n,flag=0;
  cin>>n;
  int array[n];
  for(int i=0;i<n;i++)
  {
    cin>>array[i];
  }
  int rollno;
  cin>>rollno;
  for(int i=0;i<n;i++)
  {
    if(rollno==array[i])
    {
      cout<<"She passed her exam";
      flag++;
  		break;  
    }
    
   }
  if(flag==0)
  {
  cout<<"She failed";
}
}