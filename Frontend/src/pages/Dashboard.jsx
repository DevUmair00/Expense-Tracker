import { Header } from "../components/dashboard/Header"
import SummaryCards from "../components/dashboard/SummaryCards"
import AnalyticsGrid from "../components/dashboard/AnalyticsGrid"

const Dashboard = () => {
  return (
    <div>
      <Header />
      <SummaryCards />
      <AnalyticsGrid />
    </div>
  )
}

export default Dashboard
