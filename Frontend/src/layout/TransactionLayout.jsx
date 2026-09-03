import Header from "../components/transactions/TransactionsHeader";
import TransactionTable from "../components/transactions/TransactionTable";
import TransactionFilters from "../components/transactions/TransactionFilters";

const TransactionLayout = () => {
  return (
    <div className="ml-60 mt-16 px-4 bg-black/2">
      <Header />
      <TransactionFilters />
      <TransactionTable />
    </div>
  )
}

export default TransactionLayout
