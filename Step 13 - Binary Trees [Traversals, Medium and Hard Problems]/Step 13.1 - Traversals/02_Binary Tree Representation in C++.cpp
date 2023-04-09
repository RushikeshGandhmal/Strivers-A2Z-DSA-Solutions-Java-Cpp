//User function Template for C++

/*struct node {
  int data;
  struct node *left;
  struct node *right;
};

struct node *newNode(int data) {
  struct node *node = (struct node *)malloc(sizeof(struct node));

  node->data = data;

  node->left = NULL;
  node->right = NULL;
  return (node);
}*/

class Solution{
public:

    void create_tree(node* root0, vector<int> &vec){

        //Your code goes here

        queue<node*> q;

        q.push(root0);

        for(int i=1;i<vec.size();i+=2){

            auto tmp=q.front();

            q.pop();

            tmp->left=newNode(vec[i]);

            q.push(tmp->left);

            tmp->right=newNode(vec[i+1]);

            q.push(tmp->right);

        }

    }

};