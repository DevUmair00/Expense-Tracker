import DashboardLayout from "../layout/DashboardLayout";
import Sidebar from "../layout/Sidebar";
import Navbar from "../layout/Navbar";

const Dashboard = () => {
  return (
    <div className="mb-20">
      <Sidebar />
      <Navbar />
      <DashboardLayout />    
    </div>
  );
};

export default Dashboard;
