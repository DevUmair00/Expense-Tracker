import DashboardLayout from "../layout/DashboardLayout"
import Sidebar from "../layout/Sidebar"

const Dashboard = () => {
  return (
    <div className="grid grid-cols-[1fr_6fr]">
        <Sidebar/>
        <DashboardLayout />
    </div>
  )
}

export default Dashboard
