import Header from '../components/dashboard/Header';
import SummaryCards from '../components/dashboard/SummaryCards';
import AnalyticsGrid from '../components/dashboard/AnalyticsGrid';

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


