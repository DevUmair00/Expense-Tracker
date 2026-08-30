import DashboardLayout from "../layout/DashboardLayout";
import Sidebar from "../layout/Sidebar";
import Navbar from "../layout/Navbar";

const Dashboard = () => {
  return (
    <div className="">
      <Sidebar />
      <Navbar />
      <DashboardLayout />      
    </div>
  );
};

export default Dashboard;
