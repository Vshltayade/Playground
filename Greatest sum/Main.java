/*#include<iostream>
using namespace std;
int main()
{
  int m,n,q,r1=0;
  cin>>m>>n;
  int a[m][n],r[3];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      r1+=a[i][j];
    }
    r[i]=r1;
   cout<<r[i]<<" ";
    r1=0;
  }cout<<endl;
  for(int i=0;i<m-1;i++)
  {
    if(r[i]<r[i+1])
    {
      q=i+2;
    }
  }
  cout<<"Row "<<q<<" has maximum sum";cout<<endl;
  
  
  
  
  
  
  cout<<"Sum of columns is ";
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      r1+=a[j][i];
    }
    r[i]=r1;
   cout<<r[i]<<" ";
    r1=0;
  }cout<<endl;
  
   for(int i=0;i<m-1;i++)
  {
    if(r[i]<r[i+1])
    {
      q=i+2;
    }
     if(r[i]==r[i+1])
       q=i+1;
     
  }
  cout<<"Column "<<q<<" has maximum sum";cout<<endl;
  return 0;
}*/

#include<iostream>
using namespace std;
int main()
{
 int r,c,rmax=0,cmax=0,rsum=0,csum=0,row=0,col=0;
  cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++)
  {
    for (int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  {
    rsum=0;
    for (int j=0;j<c;j++)
    {

      rsum=rsum+a[i][j];
    }
    cout<<rsum<<" ";
    if(rmax<rsum)
    {
      rmax=rsum;
      row=i+1;
    }
  }
  cout<<"\n";
  cout<<"Row "<<row<<" has maximum sum";
  for(int i=0;i<r;i++)
  {
    for (int j=0;j<c;j++)
    {
      b[i][j]=a[j][i];
    }
  }
  cout<<"\nSum of columns is ";
  for(int i=0;i<r;i++)
  {
    csum=0;
    for (int j=0;j<c;j++)
    {
      csum=csum+b[i][j];
    }
    cout<<csum<<" ";
    if(cmax<csum)
    {
      cmax=csum;
      col=i+1;
    }
  }
  cout<<"\n";
  cout<<"Column "<<col<<" has maximum sum";
  return 0;
}