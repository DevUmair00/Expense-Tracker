import LineChart from "./LineChart";
import PieChart from "./PieChart";

const AnalyticsGrid = () => {
  return (
    <div className="grid grid-cols-1 lg:grid-cols-2 items-center justify-center gap-8">
      <div className="flex flex-col gap-6 border-2 border-black/20 rounded-xl p-4 bg-white">
        <span className="text-xl text-black font-medium">Monthly Expense</span>
        <LineChart />
      </div>
      <div className="border-2 border-black/20 rounded-xl p-4 bg-white">
        <PieChart />
      </div>      
    </div>
  );
};

export default AnalyticsGrid;



