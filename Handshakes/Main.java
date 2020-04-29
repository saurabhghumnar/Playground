#include<iostream>
using namespace std;
int main()
{
int n;
  std::cin>>n;
  int handshakes;
  for(int i=1;i<n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      handshakes++;
    }
  }
  std::cout<<handshakes;
}