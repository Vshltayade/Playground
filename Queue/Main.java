/*#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0,count=0;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  while(sum>=0)
  {
    count++;
    sum=sum-m;
    
  }
  cout<<count;
}*/

#include<iostream>
using namespace std;
int q(int n,int m,int a[]){
  int sum=0;
  for(int i=0;i<n;i++){
    sum+=a[i];}
  if(n==1 && m==2)
    return 1;
  else
    return (sum/m)+1;}
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  for(int i=0;i<n;i++){
    cin>>a[i];}
  cout<<q(n,m,a);
  
}