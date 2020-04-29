#include <iostream>
using namespace std;
int main() {
int n;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
    for(int j=1;j<n;j++)
    {
      cout<<i;
    }
    cout<<i+1;
    cout<<"\n";
  }
    else
    {
      cout<<i+1;
      for(int j=1;j<n;j++)
    {
      cout<<i;
    }
    
    cout<<"\n";
    }
  }
  return 0;
}