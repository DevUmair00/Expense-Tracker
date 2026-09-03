import TransactionSearchBar from "./TransactionSearchBar";
import TransactionFilterItems from "./TransactionFilterItems";

const TransactionFilters = () => {
  return (
    <div className="mt-8 w-full leading-18 rounded-lg border border-gray-200 bg-white p-4 shadow-sm sm:mt-12 sm:p-5" >
      <TransactionSearchBar />
      <TransactionFilterItems />
    </div>

  );
};

export default TransactionFilters;
