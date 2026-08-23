
export const Header = () => {
  return (
    <div className="flex items-center justify-between px-6 pt-4"> 
      <div>
        <h1>Dashboard</h1>
        <p>Welcome back! Here's your financial overview.</p>
      </div>
      <div>
          <button>Add Expense</button>
      </div>
    </div>
  );
};
