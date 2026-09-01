import Header from '../components/dashboard/DashboardHeader';
import SummaryCards from '../components/dashboard/DashboardSummaryCards';
import AnalyticsGrid from '../components/dashboard/DashboardAnalyticsGrid';

const DashboardLayout = () => {
  return (
    <div className="ml-60 mt-16 px-4 bg-black/2">
      <Header />
      <SummaryCards />
      <AnalyticsGrid />
    </div>
  )
}

export default DashboardLayout;


